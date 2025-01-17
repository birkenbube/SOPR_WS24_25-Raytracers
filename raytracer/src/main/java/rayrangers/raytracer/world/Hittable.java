package rayrangers.raytracer.world;

import rayrangers.raytracer.algorithm.HitRecord;
import rayrangers.raytracer.algorithm.Ray;

/**
 * Interface for all objects hittable by a ray.
 * 
 * Inspired by
 * https://raytracing.github.io/books/RayTracingInOneWeekend.html#toc6.3
 */
public interface Hittable {

    /**
     * Checks if a ray has a hit in the specified interval [t0; t1].
     * 
     * @param ray    TEST!!!!!
     * @param t0     TEST!!!!!
     * @param t1     TEST!!!!!
     * @param record TEST!!!!!
     * @return Returns true if a hit occurred in the interval.
     */
    boolean hit(Ray ray, double t0, double t1, HitRecord record);

    // TODO: Bounding Box probably here?
}
