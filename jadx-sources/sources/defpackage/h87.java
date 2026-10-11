package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface h87 {
    void deleteByWorkSpecId(String str);

    List getTagsForWorkSpecId(String str);

    void insert(g87 g87Var);

    void insertTags(String str, Set set);
}
