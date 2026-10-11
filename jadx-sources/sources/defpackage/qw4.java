package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qw4 {
    public static final /* synthetic */ qw4[] A;
    public static final qw4 x;
    public static final qw4 y;
    public static final qw4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qw4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qw4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qw4] */
    static {
        ?? r0 = new Enum("SOCKS", 0);
        x = r0;
        ?? r1 = new Enum("HTTP", 1);
        y = r1;
        ?? r2 = new Enum("UNKNOWN", 2);
        z = r2;
        A = new qw4[]{r0, r1, r2};
    }

    public static qw4 valueOf(String str) {
        return (qw4) Enum.valueOf(qw4.class, str);
    }

    public static qw4[] values() {
        return (qw4[]) A.clone();
    }
}
