package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kb2 {
    public static final kb2 A;
    public static final kb2 B;
    public static final /* synthetic */ kb2[] C;
    public static final kb2 x;
    public static final kb2 y;
    public static final kb2 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kb2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kb2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kb2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kb2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, kb2] */
    static {
        ?? r0 = new Enum("ON_CONFIGURE", 0);
        x = r0;
        ?? r1 = new Enum("ON_CREATE", 1);
        y = r1;
        ?? r2 = new Enum("ON_UPGRADE", 2);
        z = r2;
        ?? r3 = new Enum("ON_DOWNGRADE", 3);
        A = r3;
        ?? r4 = new Enum("ON_OPEN", 4);
        B = r4;
        C = new kb2[]{r0, r1, r2, r3, r4};
    }

    public static kb2 valueOf(String str) {
        return (kb2) Enum.valueOf(kb2.class, str);
    }

    public static kb2[] values() {
        return (kb2[]) C.clone();
    }
}
