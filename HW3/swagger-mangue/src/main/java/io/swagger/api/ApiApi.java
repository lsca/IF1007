/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Deploy;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-19T16:30:17.888Z")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "Add new deploy", nickname = "addDeploy", notes = "", tags={ "Deploy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/api/kube/deploy",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addDeploy(@ApiParam(value = "Deploy object that needs to be added to the store" ,required=true )  @Valid @RequestBody Deploy body);


    @ApiOperation(value = "Delete an existing deploy", nickname = "deleteDeploy", notes = "", tags={ "Deploy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Deploy not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/api/kube/deploy",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeploy(@ApiParam(value = "Deploy object that needs to be added to the store" ,required=true )  @Valid @RequestBody Deploy body);


    @ApiOperation(value = "Update an existing deploy", nickname = "updateDeploy", notes = "", tags={ "Deploy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Deploy not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/api/kube/deploy",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateDeploy(@ApiParam(value = "Deploy object that needs to be added to the store" ,required=true )  @Valid @RequestBody Deploy body);

}
