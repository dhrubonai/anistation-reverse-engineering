package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oq4 {
    public static final /* synthetic */ oq4[] A;
    public static final oq4 x;
    public static final oq4 y;
    public static final oq4 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [oq4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oq4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oq4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Initial", 0);
        x = r0;
        ?? r1 = new Enum("Main", 1);
        y = r1;
        ?? r2 = new Enum("Final", 2);
        z = r2;
        A = new oq4[]{r0, r1, r2};
    }

    public static oq4 valueOf(String str) {
        return (oq4) Enum.valueOf(oq4.class, str);
    }

    public static oq4[] values() {
        return (oq4[]) A.clone();
    }
}
