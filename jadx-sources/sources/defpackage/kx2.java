package defpackage;

/* loaded from: classes.dex */
public enum kx2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String x;

    kx2(String str) {
        this.x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.x;
    }
}
