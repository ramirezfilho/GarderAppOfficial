<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Home</title>

        <meta name="description" content="Source code generated using layoutit.com">
        <meta name="author" content="LayoutIt!">

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

    </head>
    <body>
        <div class="dropdown">
            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Menu
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a href="listacontatos.jsp">Lista Contatos</a></li>
                <li><a href="digitaidade.jsp">Digita</a></li>
                <li><a href="mostraidade.jsp">Mostra</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Separated link</a></li>
            </ul>
        </div>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                </div>


                <div class="col-md-4">
                    <h3>Garder 
                        <small class="text-muted">keep everything organized</small>
                    </h3>
                    <div class="panel-group" id="panel-839759">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-839759" 
                                   href="#panel-element-121759">Cadastro de clientes</a>
                            </div>
                            <div id="panel-element-121759" class="panel-collapse collapse">

                                <div class="panel-body">

                                    <form action="AdicionaContatoLogic" method="POST">
                                        <div class="form-group">
                                            <label for="formGroupExampleInput">Nome</label>
                                            <input type="text" class="form-control" id="formGroupExampleInput" 
                                                   placeholder="Nome" required name="nome" />
                                            <br />
                                        </div>

                                        <div class="form-group">
                                            <label for="formGroupExampleInput">E-mail</label>
                                            <input type="email" class="form-control" id="formGroupExampleInput" 
                                                   placeholder="nome@email.com"  name="email" />
                                            <br />
                                        </div>

                                        <div class="form-group">
                                            <label for="formGroupExampleInput">Endere�o</label>
                                            <input type="text" class="form-control" id="formGroupExampleInput" 
                                                   placeholder="Endere�o" name="endereco" />
                                            <br />
                                        </div>

                                        <div class="form-group">
                                            <label for="formGroupExampleInput">Telefone</label>
                                            <input type="tel" class="form-control" id="formGroupExampleInput" 
                                                   placeholder="55-31-996971238" pattern="^\d{2}-\d{2}-\d{9}$" title="Formato: 55-31-999999999" required name="telefone" />
                                            <br/>                                                        
                                            <input class="btn btn-primary" type="submit" value="Gravar" />
                                            <input class="btn btn-primary" type="reset" value="Cancelar"/>

                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <a class="panel-title collapsed" data-toggle="collapse" 
                                   data-parent="#panel-839759" href="#panel-element-121227">Gerenciamento de clientes</a>
                            </div>
                            <div id="panel-element-121227" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <form action="RemoveContato" method="POST">
                                        <div class="form-group">
                                            <label for="formGroupExampleInput">Remover</label>
                                            <input type="number" class="form-control" id="formGroupExampleInput" 
                                                   placeholder="ID" required name="id" />
                                            <br />
                                        </div>
                                        <input class="btn btn-primary" type="submit" value="Gravar" />
                                        <input class="btn btn-primary" type="reset" value="Cancelar"/>
                                    </form>
                                </div>

                            </div>
                        </div>

                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <a class="panel-title collapsed" data-toggle="collapse" 
                                   data-parent="#panel-839759" href="#panel-element-121226">Lan�amento de tarefas</a>
                            </div>
                            <div id="panel-element-121226" class="panel-collapse collapse">
                                <div class="panel-body">
                                    Em constru��o
                                </div>
                            </div>
                        </div>


                    </div>

                </div>

            </div>

            <div class="col-md-4">
            </div>
        </div>

    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>
<!--        <script type="text/javascript">
            function Mudarestado(el) {

                var display = document.getElementById(el).style.display;
                if (display == "none")
                    document.getElementById(el).style.display = 'block';
                else
                    document.getElementById(el).style.display = 'none';
            }

        </script>

        <div id="geral">
            <div id="minhaDiv" style="display: none;">
                <table>
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nome" size="0.6em"> <br /></td>
                    </tr>
                    <tr>
                        <td>Cliente:</td>
                        <td><input type="number" name="sobrenome" size="0.6em"> <br /></td>
                    </tr>
                    <tr>
                        <td>Prev. Conclus�o:</td>
                        <td><input type="date" name="sobrenome" size="0.6em"> <br /></td>
                    </tr>
                    <tr>
                        <td>Data Conclus�o:</td>
                        <td><input type="date" name="sobrenome" size="0.6em"> <br /></td>
                    </tr>
                    <tr>
                        <td>End. Entrega:</td>
                        <td><input type="text" name="sobrenome" size="0.6em"> <br /></td>
                    </tr>
                    <tr>
                        <td><button type="button">Submit</button> <br /></td>
                    </tr>
                </table>
            </div>

            <button	 type="submit" onclick="Mudarestado('minhaDiv')">
                Launch Task</button>

            <div id="divInfos" style="display: none;">

            </div>

        </div>-->
