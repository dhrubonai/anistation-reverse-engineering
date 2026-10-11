package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v83 {
    public static final v83 x;
    public static final v83 y;
    public static final /* synthetic */ v83[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [v83, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v83, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v83, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Singleton", 0);
        x = r0;
        ?? r1 = new Enum("Factory", 1);
        y = r1;
        z = new v83[]{r0, r1, new Enum("Scoped", 2)};
    }

    public static v83 valueOf(String str) {
        return (v83) Enum.valueOf(v83.class, str);
    }

    public static v83[] values() {
        return (v83[]) z.clone();
    }
}
