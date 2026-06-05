package com.shizhi.mode.design.pattern.structural.facade;

import com.shizhi.mode.design.pattern.structural.facade.facility.DvdPlayer;
import com.shizhi.mode.design.pattern.structural.facade.facility.Projector;
import com.shizhi.mode.design.pattern.structural.facade.facility.Screen;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HomeTheaterFacade {

    private final Screen screen;
    private final Projector projector;
    private final DvdPlayer dvd;

    void watchMovie(String movie) {
        System.out.println("=== 准备观影 ===");
        screen.down();
        projector.on();
        projector.setInput(dvd);
        dvd.on();
        dvd.play(movie);
    }

    void endMovie() {
        System.out.println("=== 结束观影 ===");
        screen.up();
        projector.off();
        dvd.off();
    }

}
