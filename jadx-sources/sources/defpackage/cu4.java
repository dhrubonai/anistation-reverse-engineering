package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cu4 {
    public static final /* synthetic */ cu4[] A;
    public static final cu4 x;
    public static final cu4 y;
    public static final cu4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [cu4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cu4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cu4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        x = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        y = r1;
        ?? r2 = new Enum("HIGHEST", 2);
        z = r2;
        A = new cu4[]{r0, r1, r2};
    }

    public static cu4 valueOf(String str) {
        return (cu4) Enum.valueOf(cu4.class, str);
    }

    public static cu4[] values() {
        return (cu4[]) A.clone();
    }
}
