package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tn5 {
    public static final /* synthetic */ tn5[] A;
    public static final tn5 x;
    public static final tn5 y;
    public static final tn5 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tn5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tn5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tn5] */
    static {
        ?? r0 = new Enum("START", 0);
        x = r0;
        ?? r1 = new Enum("STOP", 1);
        y = r1;
        ?? r2 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        z = r2;
        A = new tn5[]{r0, r1, r2};
    }

    public static tn5 valueOf(String str) {
        return (tn5) Enum.valueOf(tn5.class, str);
    }

    public static tn5[] values() {
        return (tn5[]) A.clone();
    }
}
