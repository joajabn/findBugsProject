package pl.paniodprogramowania.findBugsProject.mapstruct;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;
import pl.paniodprogramowania.findBugsProject.model.Dancer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-21T12:18:06+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class DancerMapperImpl implements DancerMapper {

    @Override
    public Dancer toDancer(DancerEntity dancerDocument) {
        if ( dancerDocument == null ) {
            return null;
        }

        Dancer.DancerBuilder dancer = Dancer.builder();

        if ( dancerDocument.getDancerId() != null ) {
            dancer.id( dancerDocument.getDancerId() );
        }
        dancer.firstName( dancerDocument.getFirstName() );
        dancer.lastName( dancerDocument.getLastName() );
        dancer.preferredDance( dancerDocument.getPreferredDance() );

        return dancer.build();
    }

    @Override
    public DancePlay toDancePlay(DancePlayEntity dancerDocument) {
        if ( dancerDocument == null ) {
            return null;
        }

        DancePlay.DancePlayBuilder dancePlay = DancePlay.builder();

        dancePlay.id( dancerDocument.getDancePlayId() );
        dancePlay.title( dancerDocument.getTitle() );
        dancePlay.primaballerina( toDancer( dancerDocument.getPrimaballerina() ) );

        return dancePlay.build();
    }

    @Override
    public DancerResponse toDancerResponse(Dancer dancerDocument) {
        if ( dancerDocument == null ) {
            return null;
        }

        DancerResponse.DancerResponseBuilder dancerResponse = DancerResponse.builder();

        dancerResponse.id( dancerDocument.id() );
        dancerResponse.firstName( dancerDocument.firstName() );
        dancerResponse.lastName( dancerDocument.lastName() );
        dancerResponse.preferredDance( dancerDocument.preferredDance() );

        return dancerResponse.build();
    }
}
