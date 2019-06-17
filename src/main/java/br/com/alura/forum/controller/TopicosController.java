package br.com.alura.forum.controller;

import br.com.alura.forum.controller.Dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){

        Topico topico = new Topico("Dúvida", "Dúvida de Spring", new Curso("Spring", null),  null);

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));

    }
}
