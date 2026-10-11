package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eg6 {
    public static final /* synthetic */ eg6[] A;
    public static final eg6 x;
    public static final eg6 y;
    public static final eg6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eg6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eg6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eg6] */
    static {
        ?? r0 = new Enum("Uninitialized", 0);
        x = r0;
        ?? r1 = new Enum("Detached", 1);
        y = r1;
        ?? r2 = new Enum("Attached", 2);
        z = r2;
        A = new eg6[]{r0, r1, r2};
    }

    public static eg6 valueOf(String str) {
        return (eg6) Enum.valueOf(eg6.class, str);
    }

    public static eg6[] values() {
        return (eg6[]) A.clone();
    }
}
