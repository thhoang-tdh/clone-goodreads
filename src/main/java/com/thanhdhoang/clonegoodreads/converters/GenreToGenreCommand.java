package com.thanhdhoang.clonegoodreads.converters;

import com.thanhdhoang.clonegoodreads.commands.GenreCommand;
import com.thanhdhoang.clonegoodreads.persistence.model.Genre;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GenreToGenreCommand implements Converter<Genre, GenreCommand> {


    @Override
    public GenreCommand convert(Genre source) {
        if (source == null) {
            return null;
        }

        final GenreCommand genreCommand = new GenreCommand();
        genreCommand.setId(source.getId());
        genreCommand.setName(source.getName());
        genreCommand.setDescription(source.getDescription());

        return genreCommand;
    }
}
