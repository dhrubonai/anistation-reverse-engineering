package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t11 {
    public static final t11 A;
    public static final t11 B;
    public static final /* synthetic */ t11[] C;
    public static final t11 x;
    public static final t11 y;
    public static final t11 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t11] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t11] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t11] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, t11] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, t11] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        x = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        y = r1;
        ?? r2 = new Enum("PARKING", 2);
        z = r2;
        ?? r3 = new Enum("DORMANT", 3);
        A = r3;
        ?? r4 = new Enum("TERMINATED", 4);
        B = r4;
        C = new t11[]{r0, r1, r2, r3, r4};
    }

    public static t11 valueOf(String str) {
        return (t11) Enum.valueOf(t11.class, str);
    }

    public static t11[] values() {
        return (t11[]) C.clone();
    }
}
