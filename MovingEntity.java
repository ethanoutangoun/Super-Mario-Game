import processing.core.PImage;

import java.util.List;

public abstract class MovingEntity extends ActiveEntity {

    public MovingEntity(int actionPeriod, int animationPeriod, String id, Point position, List<PImage> images) {
        super(actionPeriod, animationPeriod, id, position, images);
    }

//    public abstract boolean moveTo(
//            WorldModel world,
//            Entity target,
//            EventScheduler scheduler);

//    public abstract boolean moveTo(
//            WorldModel world,
//            Point target,
//            EventScheduler scheduler);

}
