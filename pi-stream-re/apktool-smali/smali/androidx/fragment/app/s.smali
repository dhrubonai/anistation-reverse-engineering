.class public final Landroidx/fragment/app/s;
.super Lcom/bumptech/glide/c;
.source "SourceFile"


# instance fields
.field public final synthetic C:Landroidx/fragment/app/y;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/s;->C:Landroidx/fragment/app/y;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bumptech/glide/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final P(I)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s;->C:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Fragment "

    .line 15
    .line 16
    const-string v2, " does not have a view"

    .line 17
    .line 18
    invoke-static {v1, v0, v2}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final Q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/s;->C:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method
