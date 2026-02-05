package pl.paniodprogramowania.findBugsProject.mapstruct;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayResponse;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;
import pl.paniodprogramowania.findBugsProject.model.Dancer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-21T14:31:19+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Eclipse Adoptium)"
)
@Component
public class DancePlayMapperImpl implements DancePlayMapper {

    @Override
    public DancePlay toModel(DancePlayEntity dancePlayEntity) {
        if ( dancePlayEntity == null ) {
            return null;
        }

        DancePlay.DancePlayBuilder dancePlay = DancePlay.builder();

        dancePlay.title( dancePlayEntity.getTitle() );
        dancePlay.primaballerina( dancerEntityToDancer( dancePlayEntity.getPrimaballerina() ) );

        return dancePlay.build();
    }

    @Override
    public DancePlayEntity toEntity(DancePlay dancePlay) {
        if ( dancePlay == null ) {
            return null;
        }

        DancePlayEntity.DancePlayEntityBuilder dancePlayEntity = DancePlayEntity.builder();

        dancePlayEntity.title( dancePlay.title() );
        dancePlayEntity.primaballerina( dancerToDancerEntity( dancePlay.primaballerina() ) );

        return dancePlayEntity.build();
    }

    @Override
    public DancePlay toModel(DancePlayResponse dancePlayResponse) {
        if ( dancePlayResponse == null ) {
            return null;
        }

        DancePlay.DancePlayBuilder dancePlay = DancePlay.builder();

        dancePlay.id( dancePlayResponse.id() );
        dancePlay.title( dancePlayResponse.title() );

        return dancePlay.build();
    }

    @Override
    public DancePlayResponse toDTO(DancePlay dancePlay) {
        if ( dancePlay == null ) {
            return null;
        }

        DancePlayResponse.DancePlayResponseBuilder dancePlayResponse = DancePlayResponse.builder();

        dancePlayResponse.id( dancePlay.id() );
        dancePlayResponse.title( dancePlay.title() );

        return dancePlayResponse.build();
    }

    protected Dancer dancerEntityToDancer(DancerEntity dancerEntity) {
        if ( dancerEntity == null ) {
            return null;
        }

        Dancer.DancerBuilder dancer = Dancer.builder();

        dancer.firstName( dancerEntity.getFirstName() );
        dancer.lastName( dancerEntity.getLastName() );
        dancer.preferredDance( dancerEntity.getPreferredDance() );

        return dancer.build();
    }

    protected DancerEntity dancerToDancerEntity(Dancer dancer) {
        if ( dancer == null ) {
            return null;
        }

        DancerEntity.DancerEntityBuilder dancerEntity = DancerEntity.builder();

        dancerEntity.firstName( dancer.firstName() );
        dancerEntity.lastName( dancer.lastName() );
        dancerEntity.preferredDance( dancer.preferredDance() );

        return dancerEntity.build();
    }
}
