package br.com.aliceraltecnologia.migracaodedadosjob.writer;

import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import br.com.aliceraltecnologia.migracaodedadosjob.dominio.Pessoa;

@Configuration
public class ArquivoPessoasInvalidasWriterConfig {
	
	@Bean
	public FlatFileItemWriter<Pessoa> arquivoPessoasInvalidasWriter() {
		return new FlatFileItemWriterBuilder<Pessoa>()
				.name("arquivoPessoasInvalidasWriter")
				.resource(new FileSystemResource("arquivos/pessoas-invalidas.csv"))
				.delimited()
				.names("id")
				.build();
	}
}
