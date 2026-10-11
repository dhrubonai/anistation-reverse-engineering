package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ub5 {
    public static final /* synthetic */ ub5[] A;
    public static final ub5 x;
    public static final ub5 y;
    public static final ub5 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ub5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ub5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ub5] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        x = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        y = r1;
        ?? r2 = new Enum("DEVICE_CHARGING", 2);
        z = r2;
        A = new ub5[]{r0, r1, r2};
    }

    public static ub5 valueOf(String str) {
        return (ub5) Enum.valueOf(ub5.class, str);
    }

    public static ub5[] values() {
        return (ub5[]) A.clone();
    }
}
