package pl.put.poznan.sorting.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import pl.put.poznan.sorting.logic.SortingMechanism;
import pl.put.poznan.sorting.rest.Requests.ObjectSortRequest;
import pl.put.poznan.sorting.rest.Requests.SortRequest;
import pl.put.poznan.sorting.rest.Responses.ObjectSortResponse;
import pl.put.poznan.sorting.rest.Responses.SortResponse;


@RestController
@RequestMapping("/api")
public class SortingController {

    @PostMapping(path = {"/sort", "/numbers-sort"}, consumes = "application/json", produces = "application/json")
    public SortResponse sort(@RequestBody SortRequest request) {

        if (request == null || request.getData() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Field 'data' is required.");
        }

        String algorithm = request.getAlgorithm() == null ? "bubble" : request.getAlgorithm().toLowerCase();
        if (!algorithm.equals("bubble") /* || ... */) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unsupported algorithm: " + algorithm );
        }
        
        String order = request.getOrder() == null ? "asc" : request.getOrder().toLowerCase();
        if (!order.equals("asc") && !order.equals("desc")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order must be 'asc' or 'desc'.");
        }

        SortingMechanism sorter = new SortingMechanism(request.getData().clone(), request.getOrder());
        sorter.sort(algorithm);
        long[] result = sorter.getNumbers();
 

        return new SortResponse(result, algorithm, order);
    }

    @PostMapping(path = "/objects-sort", consumes = "application/json", produces = "application/json")
    public ObjectSortResponse sortObjects(@RequestBody ObjectSortRequest request) {

        if (request == null || request.getData() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Field 'data' is required.");
        }

        String algorithm = request.getAlgorithm() == null ? "bubble" : request.getAlgorithm().toLowerCase(); 
        if (!algorithm.equals("bubble")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unsupported algorithm: " + algorithm);
        }

        String order = request.getOrder() == null ? "asc" : request.getOrder().toLowerCase();
        if (!order.equals("asc") && !order.equals("desc")) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order must be 'asc' or 'desc'.");
        }

        SortingMechanism sorter = new SortingMechanism(request.getData().clone(), request.getOrder());
        sorter.sort(algorithm);
        long[][] result = sorter.getObjects();

        return new ObjectSortResponse(result, algorithm, order);
    }
    

}
