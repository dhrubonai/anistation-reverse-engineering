package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nb3 {
    public static final nb3 x;
    public static final /* synthetic */ nb3[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nb3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nb3] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        x = r0;
        y = new nb3[]{r0, new Enum("Vertical", 1)};
    }

    public static nb3 valueOf(String str) {
        return (nb3) Enum.valueOf(nb3.class, str);
    }

    public static nb3[] values() {
        return (nb3[]) y.clone();
    }
}
