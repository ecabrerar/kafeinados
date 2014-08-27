/*
 * Copyright (C) 2014 ecabrerar
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.ecabrerar.examples.rest.service.pdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * Simple example of pdf file from JAX-RS
 *
 * @author ecabrerar
 * @see http://www.mkyong.com/webservices/jax-rs/download-pdf-file-from-jax-rs/
 */
@Path("/pdf")
public class PdfService {

    private static final String URL = "http://docs.oracle.com/javaee/7/tutorial/doc/javaeetutorial7.pdf";

    @GET
    @Path("/get")
    @Produces("application/pdf")
    public Response getFile() {

        ResponseBuilder response = null;
        
        try {

            InputStreamReader file = new InputStreamReader(new URL(URL).openStream());

            response = Response.ok(file);
            response.header("Content-Disposition",
                    "attachment; filename=javaeetutorial7.pdf");

        } catch (IOException ex) {
            Logger.getLogger(PdfService.class.getName(),ex.getMessage());
        }

        return response.build();

    }
}
