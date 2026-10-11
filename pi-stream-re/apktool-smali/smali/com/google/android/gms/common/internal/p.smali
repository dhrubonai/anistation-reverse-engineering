.class public final Lcom/google/android/gms/common/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ln1/u;

.field public static final c:Lcom/google/android/gms/common/internal/p;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ln1/u;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "LibraryVersion"

    .line 7
    .line 8
    invoke-direct {v0, v3, v2, v1}, Ln1/u;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/common/internal/p;->b:Ln1/u;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/common/internal/p;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/android/gms/common/internal/p;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/google/android/gms/common/internal/p;->c:Lcom/google/android/gms/common/internal/p;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/common/internal/p;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
.end method
