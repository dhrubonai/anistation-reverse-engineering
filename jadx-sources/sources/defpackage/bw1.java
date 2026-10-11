package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw1 {
    public static final bw1 x;
    public static final bw1 y;
    public static final /* synthetic */ bw1[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bw1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bw1] */
    static {
        ?? r0 = new Enum("Newest", 0);
        x = r0;
        ?? r1 = new Enum("Oldest", 1);
        y = r1;
        z = new bw1[]{r0, r1};
    }

    public static bw1 valueOf(String str) {
        return (bw1) Enum.valueOf(bw1.class, str);
    }

    public static bw1[] values() {
        return (bw1[]) z.clone();
    }
}
