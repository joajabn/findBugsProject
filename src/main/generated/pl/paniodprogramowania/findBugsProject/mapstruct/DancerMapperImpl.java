package pl.paniodprogramowania.findBugsProject.mapstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.entities.DancePlayEntity;
import pl.paniodprogramowania.findBugsProject.entities.DancerEntity;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;
import pl.paniodprogramowania.findBugsProject.model.DancePlayWithoutDancer;
import pl.paniodprogramowania.findBugsProject.model.Dancer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-21T14:31:19+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Eclipse Adoptium)"
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
        dancer.plays( dancePlayEntitySetToDancePlayWithoutDancerList( dancerDocument.getDancePlays() ) );

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
        dancerResponse.plays( dancePlayWithoutDancerListToDancePlayWithoutDancerList( dancerDocument.plays() ) );

        return dancerResponse.build();
    }

    protected DancePlayWithoutDancer dancePlayEntityToDancePlayWithoutDancer(DancePlayEntity dancePlayEntity) {
        if ( dancePlayEntity == null ) {
            return null;
        }

        DancePlayWithoutDancer.DancePlayWithoutDancerBuilder dancePlayWithoutDancer = DancePlayWithoutDancer.builder();

        dancePlayWithoutDancer.title( dancePlayEntity.getTitle() );

        return dancePlayWithoutDancer.build();
    }

    protected List<DancePlayWithoutDancer> dancePlayEntitySetToDancePlayWithoutDancerList(Set<DancePlayEntity> set) {
        if ( set == null ) {
            return null;
        }

        List<DancePlayWithoutDancer> list = new ArrayList<DancePlayWithoutDancer>( set.size() );
        for ( DancePlayEntity dancePlayEntity : set ) {
            list.add( dancePlayEntityToDancePlayWithoutDancer( dancePlayEntity ) );
        }

        return list;
    }

    protected pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer dancePlayWithoutDancerToDancePlayWithoutDancer(DancePlayWithoutDancer dancePlayWithoutDancer) {
        if ( dancePlayWithoutDancer == null ) {
            return null;
        }

        pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer.DancePlayWithoutDancerBuilder dancePlayWithoutDancer1 = pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer.builder();

        dancePlayWithoutDancer1.id( dancePlayWithoutDancer.id() );
        dancePlayWithoutDancer1.title( dancePlayWithoutDancer.title() );

        return dancePlayWithoutDancer1.build();
    }

    protected List<pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer> dancePlayWithoutDancerListToDancePlayWithoutDancerList(List<DancePlayWithoutDancer> list) {
        if ( list == null ) {
            return null;
        }

        List<pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer> list1 = new ArrayList<pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayWithoutDancer>( list.size() );
        for ( DancePlayWithoutDancer dancePlayWithoutDancer : list ) {
            list1.add( dancePlayWithoutDancerToDancePlayWithoutDancer( dancePlayWithoutDancer ) );
        }

        return list1;
    }
}
