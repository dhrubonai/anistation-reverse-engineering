.class public final Lcom/google/android/play/core/integrity/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/g;


# instance fields
.field private final a:Lp6/h;


# direct methods
.method public constructor <init>(Lp6/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/be;->a:Lp6/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/be;->a:Lp6/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/play/core/integrity/bd;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/play/core/integrity/ax;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lcom/google/android/play/core/integrity/bd;-><init>(Lcom/google/android/play/core/integrity/ax;)V

    .line 12
    .line 13
    .line 14
    return-object v1
.end method
