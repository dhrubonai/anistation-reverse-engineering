package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k94 {
    public static final k94 A;
    public static final k94 B;
    public static final k94 C;
    public static final /* synthetic */ k94[] D;
    public static final k94 x;
    public static final k94 y;
    public static final k94 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k94] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k94] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k94] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k94] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, k94] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, k94] */
    static {
        ?? r0 = new Enum("NOT_REQUIRED", 0);
        x = r0;
        ?? r1 = new Enum("CONNECTED", 1);
        y = r1;
        ?? r2 = new Enum("UNMETERED", 2);
        z = r2;
        ?? r3 = new Enum("NOT_ROAMING", 3);
        A = r3;
        ?? r4 = new Enum("METERED", 4);
        B = r4;
        ?? r5 = new Enum("TEMPORARILY_UNMETERED", 5);
        C = r5;
        D = new k94[]{r0, r1, r2, r3, r4, r5};
    }

    public static k94 valueOf(String str) {
        return (k94) Enum.valueOf(k94.class, str);
    }

    public static k94[] values() {
        return (k94[]) D.clone();
    }
}
