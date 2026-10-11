package defpackage;

import android.media.Rating;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zx4 {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static Rating h(float f) {
        return Rating.newPercentageRating(f);
    }

    public static Rating i(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    public static Rating j(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static Rating k(int i) {
        return Rating.newUnratedRating(i);
    }
}
