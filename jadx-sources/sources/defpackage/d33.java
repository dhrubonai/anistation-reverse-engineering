package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class d33 {
    public static final d33 A;
    public static final /* synthetic */ d33[] B;
    public static final d33 x;
    public static final d33 y;
    public static final d33 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d33] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d33] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d33] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d33] */
    static {
        ?? r0 = new Enum("LookaheadMeasurement", 0);
        x = r0;
        ?? r1 = new Enum("LookaheadPlacement", 1);
        y = r1;
        ?? r2 = new Enum("Measurement", 2);
        z = r2;
        ?? r3 = new Enum("Placement", 3);
        A = r3;
        B = new d33[]{r0, r1, r2, r3};
    }

    public static d33 valueOf(String str) {
        return (d33) Enum.valueOf(d33.class, str);
    }

    public static d33[] values() {
        return (d33[]) B.clone();
    }
}
