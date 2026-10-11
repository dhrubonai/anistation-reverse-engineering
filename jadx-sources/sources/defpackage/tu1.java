package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu1 {
    public static final /* synthetic */ tu1[] A;
    public static final tu1 x;
    public static final tu1 y;
    public static final tu1 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [tu1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tu1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tu1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PreEnter", 0);
        x = r0;
        ?? r1 = new Enum("Visible", 1);
        y = r1;
        ?? r2 = new Enum("PostExit", 2);
        z = r2;
        A = new tu1[]{r0, r1, r2};
    }

    public static tu1 valueOf(String str) {
        return (tu1) Enum.valueOf(tu1.class, str);
    }

    public static tu1[] values() {
        return (tu1[]) A.clone();
    }
}
