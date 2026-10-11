.class public abstract Lcom/google/android/gms/common/api/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final API_PRIORITY_GAMES:I = 0x1

.field public static final API_PRIORITY_OTHER:I = 0x7fffffff

.field public static final API_PRIORITY_PLUS:I = 0x2


# virtual methods
.method public getImpliedScopes(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getPriority()I
    .locals 1

    const v0, 0x7fffffff

    return v0
.end method
