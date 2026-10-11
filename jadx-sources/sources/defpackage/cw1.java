package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cw1 {
    public static final cw1 x;
    public static final cw1 y;
    public static final /* synthetic */ cw1[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cw1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cw1] */
    static {
        ?? r0 = new Enum("Newest", 0);
        x = r0;
        ?? r1 = new Enum("Oldest", 1);
        y = r1;
        z = new cw1[]{r0, r1};
    }

    public static cw1 valueOf(String str) {
        return (cw1) Enum.valueOf(cw1.class, str);
    }

    public static cw1[] values() {
        return (cw1[]) z.clone();
    }
}
