package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fe2 {
    public static final fe2 x;
    public static final fe2 y;
    public static final /* synthetic */ fe2[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [fe2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fe2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Volume", 0);
        x = r0;
        ?? r1 = new Enum("Brightness", 1);
        y = r1;
        z = new fe2[]{r0, r1};
    }

    public static fe2 valueOf(String str) {
        return (fe2) Enum.valueOf(fe2.class, str);
    }

    public static fe2[] values() {
        return (fe2[]) z.clone();
    }
}
