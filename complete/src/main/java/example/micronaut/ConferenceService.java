package example.micronaut;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Singleton // <1>
public class ConferenceService {

    private List<Conference> CONFERENCES = Arrays.asList(
            new Conference("Greach"),
            new Conference("GR8Conf EU"),
            new Conference("Micronaut Summit"),
            new Conference("Devoxx Belgium"),
            new Conference("Oracle Code One"),
            new Conference("CommitConf"),
            new Conference("Codemotion Madrid")
    );

    public Conference randomConf() {
        Collections.shuffle(CONFERENCES);
        return CONFERENCES.get(0); // <2>
    }
}