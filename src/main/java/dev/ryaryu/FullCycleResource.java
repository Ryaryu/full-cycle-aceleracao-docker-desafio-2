package dev.ryaryu;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class FullCycleResource {

  @CheckedTemplate
  public static class Templates {
    public static native TemplateInstance index();
  }

  @GET
  @Produces(MediaType.TEXT_HTML)
  public TemplateInstance hello() {
    return Templates.index().data("modulos", Modulo.findAll().list());
  }

}