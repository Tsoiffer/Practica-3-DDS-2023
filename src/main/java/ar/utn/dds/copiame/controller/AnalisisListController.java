package ar.utn.dds.copiame.controller;

import ar.utn.dds.copiame.AnalsisRepository;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class AnalisisListController implements Handler {
    private AnalsisRepository repo;
    public AnalisisListController(AnalsisRepository repo) {
        super();
        this.repo = repo;
    }
    @Override
    public void handle(Context ctx) throws Exception {
        ctx.json(repo.all());
    }


}

