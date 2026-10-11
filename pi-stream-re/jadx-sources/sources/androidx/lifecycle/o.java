package androidx.lifecycle;

/* loaded from: classes.dex */
public enum o {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(o oVar) {
        if (compareTo(oVar) >= 0) {
            return true;
        }
        return false;
    }
}
