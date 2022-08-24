package com.example.services;

import com.example.models.Request;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.examples.Utils;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

public class ParseData {

    public String parseJson(String jsonStringObj) throws IOException, ProcessingException {

        JsonReader jsonReader = Json.createReader(new StringReader(jsonStringObj));

        JsonObject jsonObject = jsonReader.readObject();

        jsonReader.close();


        final JsonNode schemaNode = Utils.loadResource("C:\\Users\\ADMIN\\IdeaProjects\\novaWork\\src\\main\\resources\\validate.json");

        JsonSchemaFactory schemaFactory = JsonSchemaFactory.byDefault();

        JsonSchema schema = schemaFactory.getJsonSchema(schemaNode);

        ProcessingReport report;

//        report = schema.validate(jsonStringObj);

        return null;
    }
}
