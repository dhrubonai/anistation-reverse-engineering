package l1;

/* loaded from: classes.dex */
public final class v extends Exception {
    public v(long j4, long j10) {
        super("Unexpected audio track timestamp discontinuity: expected " + j10 + ", got " + j4);
    }
}
