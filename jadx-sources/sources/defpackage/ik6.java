package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ik6 {
    public static final ik6 A;
    public static final /* synthetic */ ik6[] B;
    public static final ik6 x;
    public static final ik6 y;
    public static final ik6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ik6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ik6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ik6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ik6] */
    static {
        ?? r0 = new Enum("SUCCESSFUL", 0);
        x = r0;
        ?? r1 = new Enum("REREGISTER", 1);
        y = r1;
        ?? r2 = new Enum("CANCELLED", 2);
        z = r2;
        ?? r3 = new Enum("ALREADY_SELECTED", 3);
        A = r3;
        B = new ik6[]{r0, r1, r2, r3};
    }

    public static ik6 valueOf(String str) {
        return (ik6) Enum.valueOf(ik6.class, str);
    }

    public static ik6[] values() {
        return (ik6[]) B.clone();
    }
}
