package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class va3 {
    public static final va3 A;
    public static final va3 B;
    public static final /* synthetic */ va3[] C;
    public static final va3 x;
    public static final va3 y;
    public static final va3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, va3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, va3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, va3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, va3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, va3] */
    static {
        ?? r0 = new Enum("Measuring", 0);
        x = r0;
        ?? r1 = new Enum("LookaheadMeasuring", 1);
        y = r1;
        ?? r2 = new Enum("LayingOut", 2);
        z = r2;
        ?? r3 = new Enum("LookaheadLayingOut", 3);
        A = r3;
        ?? r4 = new Enum("Idle", 4);
        B = r4;
        C = new va3[]{r0, r1, r2, r3, r4};
    }

    public static va3 valueOf(String str) {
        return (va3) Enum.valueOf(va3.class, str);
    }

    public static va3[] values() {
        return (va3[]) C.clone();
    }
}
