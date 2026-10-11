package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw4 {
    public static final bw4 x;
    public static final /* synthetic */ bw4[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bw4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bw4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bw4] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        x = r0;
        y = new bw4[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static bw4 valueOf(String str) {
        return (bw4) Enum.valueOf(bw4.class, str);
    }

    public static bw4[] values() {
        return (bw4[]) y.clone();
    }
}
