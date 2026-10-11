package p5;

/* loaded from: classes.dex */
public final class e extends Exception {
    public e(String str) {
        super(String.format("Protocol version %s not supported", str));
    }
}
