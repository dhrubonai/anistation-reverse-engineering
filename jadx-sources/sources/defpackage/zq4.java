package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zq4 {
    public static final /* synthetic */ zq4[] A;
    public static final zq4 x;
    public static final zq4 y;
    public static final zq4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zq4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zq4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zq4] */
    static {
        ?? r0 = new Enum("Unknown", 0);
        x = r0;
        ?? r1 = new Enum("Dispatching", 1);
        y = r1;
        ?? r2 = new Enum("NotDispatching", 2);
        z = r2;
        A = new zq4[]{r0, r1, r2};
    }

    public static zq4 valueOf(String str) {
        return (zq4) Enum.valueOf(zq4.class, str);
    }

    public static zq4[] values() {
        return (zq4[]) A.clone();
    }
}
