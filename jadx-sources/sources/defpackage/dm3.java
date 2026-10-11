package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dm3 {
    public static final /* synthetic */ dm3[] A;
    public static final dm3 x;
    public static final dm3 y;
    public static final dm3 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dm3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dm3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dm3] */
    static {
        ?? r0 = new Enum("IsPlacedInLookahead", 0);
        x = r0;
        ?? r1 = new Enum("IsPlacedInApproach", 1);
        y = r1;
        ?? r2 = new Enum("IsNotPlaced", 2);
        z = r2;
        A = new dm3[]{r0, r1, r2};
    }

    public static dm3 valueOf(String str) {
        return (dm3) Enum.valueOf(dm3.class, str);
    }

    public static dm3[] values() {
        return (dm3[]) A.clone();
    }
}
