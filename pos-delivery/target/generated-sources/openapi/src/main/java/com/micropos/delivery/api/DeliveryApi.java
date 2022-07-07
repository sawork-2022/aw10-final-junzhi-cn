/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.micropos.delivery.api;

import com.micropos.delivery.dto.DeliveryDto;
import com.micropos.delivery.dto.ErrorDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-05T19:57:54.465401800+08:00[Asia/Shanghai]")
@Validated
@Tag(name = "delivery", description = "the delivery API")
public interface DeliveryApi {

    /**
     * GET /delivery/byorder/{orderId} : find delivery by order id
     *
     * @param orderId Order ID (required)
     * @return Delivery found (status code 200)
     *         or Invalid delivery (status code 400)
     */
    @Operation(
        operationId = "findDeliveryByOrderId",
        summary = "find delivery by order id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Delivery found", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  DeliveryDto.class))),
            @ApiResponse(responseCode = "400", description = "Invalid delivery", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/delivery/byorder/{orderId}",
        produces = { "application/json" }
    )
    default Mono<ResponseEntity<DeliveryDto>> findDeliveryByOrderId(
        @Parameter(name = "orderId", description = "Order ID", required = true, schema = @Schema(description = "")) @PathVariable("orderId") Long orderId,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"orderId\" : 6, \"id\" : 0, \"status\" : \"CREATED\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * GET /delivery/byid/{id} : get delivery by id
     *
     * @param id Delivery ID (required)
     * @return Delivery found (status code 200)
     *         or Invalid delivery (status code 400)
     */
    @Operation(
        operationId = "getDeliveryById",
        summary = "get delivery by id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Delivery found", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  DeliveryDto.class))),
            @ApiResponse(responseCode = "400", description = "Invalid delivery", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/delivery/byid/{id}",
        produces = { "application/json" }
    )
    default Mono<ResponseEntity<DeliveryDto>> getDeliveryById(
        @Parameter(name = "id", description = "Delivery ID", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"orderId\" : 6, \"id\" : 0, \"status\" : \"CREATED\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
