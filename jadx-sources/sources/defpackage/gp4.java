package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gp4 {
    public static final /* synthetic */ gp4[] A;
    public static final gp4 x;
    public static final gp4 y;
    public static final gp4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gp4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gp4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gp4] */
    static {
        ?? r0 = new Enum("ScreenLocked", 0);
        x = r0;
        ?? r1 = new Enum("TapToUnlock", 1);
        y = r1;
        ?? r2 = new Enum("Unlocked", 2);
        z = r2;
        A = new gp4[]{r0, r1, r2};
    }

    public static gp4 valueOf(String str) {
        return (gp4) Enum.valueOf(gp4.class, str);
    }

    public static gp4[] values() {
        return (gp4[]) A.clone();
    }
}
