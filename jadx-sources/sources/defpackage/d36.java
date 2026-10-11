package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d36 {
    public static final d36 A;
    public static final d36 B;
    public static final /* synthetic */ d36[] C;
    public static final d36 x;
    public static final d36 y;
    public static final d36 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d36] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d36] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d36] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, d36] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, d36] */
    static {
        ?? r0 = new Enum("END", 0);
        x = r0;
        ?? r1 = new Enum("ROLLBACK", 1);
        y = r1;
        ?? r2 = new Enum("BEGIN_EXCLUSIVE", 2);
        z = r2;
        ?? r3 = new Enum("BEGIN_IMMEDIATE", 3);
        A = r3;
        ?? r4 = new Enum("BEGIN_DEFERRED", 4);
        B = r4;
        C = new d36[]{r0, r1, r2, r3, r4};
    }

    public static d36 valueOf(String str) {
        return (d36) Enum.valueOf(d36.class, str);
    }

    public static d36[] values() {
        return (d36[]) C.clone();
    }
}
