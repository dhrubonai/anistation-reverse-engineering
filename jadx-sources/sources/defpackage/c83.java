package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c83 {
    public static final c83 x;
    public static final /* synthetic */ c83[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c83] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c83] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c83] */
    static {
        ?? r0 = new Enum("INVARIANT", 0);
        x = r0;
        y = new c83[]{r0, new Enum("IN", 1), new Enum("OUT", 2)};
    }

    public static c83 valueOf(String str) {
        return (c83) Enum.valueOf(c83.class, str);
    }

    public static c83[] values() {
        return (c83[]) y.clone();
    }
}
