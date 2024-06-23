import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CidadeDAO cidadeDAO = new CidadeDAO();
        TreinadorDAO treinadorDAO = new TreinadorDAO();
        GinasioDAO ginasioDAO = new GinasioDAO();
        LiderDAO liderDAO = new LiderDAO();
        GinasioHasTreinadorDAO ginasioHasTreinadorDAO = new GinasioHasTreinadorDAO();
        while (true) {
            System.out.println("Escolha uma categoria para operar:");
            System.out.println("1. Cidades");
            System.out.println("2. Treinadores");
            System.out.println("3. Ginásios");
            System.out.println("4. Lideres");
            System.out.println("5. Adicionar treinador ao ginásio");
            System.out.println("6. Sair");

            int categoria = scanner.nextInt();
            scanner.nextLine();

            switch (categoria) {
                case 1:
                    while (true) {
                        System.out.println("Escolha uma operação para Cidades:");
                        System.out.println("1. Inserir uma cidade");
                        System.out.println("2. Atualizar uma cidade");
                        System.out.println("3. Deletar uma cidade");
                        System.out.println("4. Listar todas as cidades");
                        System.out.println("5. Voltar ao menu principal");

                        int escolhaCidade = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaCidade) {
                            case 1:
                                System.out.println("Inserir uma nova cidade:");
                                System.out.print("Nome da cidade: ");
                                String nomeCidade = scanner.nextLine();
                                System.out.print("Região da cidade: ");
                                String regiaoCidade = scanner.nextLine();
                                System.out.print("População da cidade: ");
                                int populacaoCidade = scanner.nextInt();
                                scanner.nextLine();

                                Cidade novaCidade = new Cidade(nomeCidade, regiaoCidade, populacaoCidade);
                                cidadeDAO.adicionarCidade(novaCidade);
                                System.out.println("Cidade inserida com sucesso!");
                                break;

                            case 2:
                                System.out.println("Atualizar uma cidade:");
                                System.out.print("Nome da cidade a ser atualizada: ");
                                nomeCidade = scanner.nextLine();
                                System.out.print("Nova região da cidade: ");
                                regiaoCidade = scanner.nextLine();
                                System.out.print("Nova população da cidade: ");
                                populacaoCidade = scanner.nextInt();
                                scanner.nextLine();

                                Cidade cidadeAtualizada = new Cidade(nomeCidade, regiaoCidade, populacaoCidade);
                                cidadeDAO.atualizarCidade(cidadeAtualizada);
                                System.out.println("Cidade atualizada com sucesso!");
                                break;

                            case 3:
                                System.out.println("Deletar uma cidade:");
                                System.out.print("Nome da cidade a ser deletada: ");
                                nomeCidade = scanner.nextLine();

                                cidadeDAO.deletarCidade(nomeCidade);
                                System.out.println("Cidade deletada com sucesso!");
                                break;

                            case 4:
                                System.out.println("Listar todas as cidades:");
                                cidadeDAO.listarCidades();
                                break;

                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                        }
                        if (escolhaCidade == 5) break;
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Escolha uma operação para Treinadores:");
                        System.out.println("1. Inserir um treinador");
                        System.out.println("2. Atualizar um treinador");
                        System.out.println("3. Deletar um treinador");
                        System.out.println("4. Listar todos os treinadores");
                        System.out.println("5. Voltar ao menu principal");

                        int escolhaTreinador = scanner.nextInt();
                        scanner.nextLine();
                        switch (escolhaTreinador) {
                            case 1:
                                System.out.println("Inserir um novo treinador:");
                                System.out.print("Nome do treinador: ");
                                String nomeTreinador = scanner.nextLine();
                                System.out.print("Pokémon Ace do treinador: ");
                                String pokemonAceTreinador = scanner.nextLine();
                                System.out.print("Idade do treinador: ");
                                String idadeTreinador = scanner.nextLine();

                                Treinador novoTreinador = new Treinador(nomeTreinador, pokemonAceTreinador, idadeTreinador);
                                treinadorDAO.adicionarTreinador(novoTreinador);
                                System.out.println("Treinador inserido com sucesso!");
                                break;

                            case 2:
                                System.out.println("Atualizar um treinador:");
                                System.out.print("Nome do treinador a ser atualizado: ");
                                nomeTreinador = scanner.nextLine();
                                System.out.print("Novo Pokémon Ace do treinador: ");
                                pokemonAceTreinador = scanner.nextLine();
                                System.out.print("Nova idade do treinador: ");
                                idadeTreinador = scanner.nextLine();

                                Treinador treinadorAtualizado = new Treinador(nomeTreinador, pokemonAceTreinador, idadeTreinador);
                                treinadorDAO.atualizarTreinador(treinadorAtualizado);
                                System.out.println("Treinador atualizado com sucesso!");
                                break;

                            case 3:
                                System.out.println("Deletar um treinador:");
                                System.out.print("Nome do treinador a ser deletado: ");
                                nomeTreinador = scanner.nextLine();

                                treinadorDAO.deletarTreinador(nomeTreinador);
                                System.out.println("Treinador deletado com sucesso!");
                                break;

                            case 4:
                                System.out.println("Listar todos os treinadores:");
                                treinadorDAO.listarTreinadores();
                                break;

                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                        }
                        if (escolhaTreinador == 5) break;
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("Escolha uma operação para Ginásios:");
                        System.out.println("1. Inserir um ginásio");
                        System.out.println("2. Atualizar um ginásio");
                        System.out.println("3. Deletar um ginásio");
                        System.out.println("4. Listar todos os ginásios");
                        System.out.println("5. Voltar ao menu principal");

                        int escolhaGinasio = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaGinasio) {
                            case 1:
                                System.out.println("Inserir um novo ginásio:");
                                System.out.print("Tipo do ginásio: ");
                                String tipoGinasio = scanner.nextLine();
                                System.out.print("Insígnia do ginásio: ");
                                String insigniaGinasio = scanner.nextLine();
                                System.out.print("Nome do líder do ginásio: ");
                                String liderNomeLider = scanner.nextLine();
                                System.out.print("Nome da cidade do ginásio: ");
                                String cidadeNomeCidade = scanner.nextLine();

                                Ginasio novoGinasio = new Ginasio(tipoGinasio, insigniaGinasio, liderNomeLider, cidadeNomeCidade);
                                ginasioDAO.adicionarGinasio(novoGinasio);
                                System.out.println("Ginásio inserido com sucesso!");
                                break;

                            case 2:
                                System.out.println("Atualizar um ginásio:");
                                System.out.print("Insígnia do ginásio a ser atualizado: ");
                                insigniaGinasio = scanner.nextLine();
                                System.out.print("Novo tipo do ginásio: ");
                                tipoGinasio = scanner.nextLine();
                                System.out.print("Novo nome do líder do ginásio: ");
                                liderNomeLider = scanner.nextLine();
                                System.out.print("Novo nome da cidade do ginásio: ");
                                cidadeNomeCidade = scanner.nextLine();

                                Ginasio ginasioAtualizado = new Ginasio(tipoGinasio, insigniaGinasio, liderNomeLider, cidadeNomeCidade);
                                ginasioDAO.atualizarGinasio(ginasioAtualizado);
                                System.out.println("Ginásio atualizado com sucesso!");
                                break;

                            case 3:
                                System.out.println("Deletar um ginásio:");
                                System.out.print("Insígnia do ginásio a ser deletado: ");
                                insigniaGinasio = scanner.nextLine();

                                ginasioDAO.deletarGinasio(insigniaGinasio);
                                System.out.println("Ginásio deletado com sucesso!");
                                break;

                            case 4:
                                System.out.println("Listar todos os ginásios:");
                                ginasioDAO.listarGinasios();
                                break;

                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                        }
                        if (escolhaGinasio == 5) break;
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("Escolha uma operação para Líderes:");
                        System.out.println("1. Inserir um líder");
                        System.out.println("2. Atualizar um líder");
                        System.out.println("3. Deletar um líder");
                        System.out.println("4. Listar todos os líderes");
                        System.out.println("5. Voltar ao menu principal");

                        int escolhaLider = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaLider) {
                            case 1:
                                System.out.println("Inserir um líder:");
                                System.out.print("Nome do líder: ");
                                String nomeLider = scanner.nextLine();
                                System.out.print("Pokémon Ace do líder: ");
                                String pokemonAce = scanner.nextLine();
                                System.out.print("Idade do líder: ");
                                String idadeLider = scanner.nextLine();
                                System.out.print("Nome da cidade do líder: ");
                                String nomeCidade = scanner.nextLine();

                                Lider novoLider = new Lider(nomeLider, pokemonAce, idadeLider, nomeCidade);
                                liderDAO.adicionarLider(novoLider);
                                System.out.println("Líder inserido com sucesso!");
                                break;

                            case 2:
                                System.out.println("Atualizar um líder:");
                                System.out.print("Nome do líder a ser atualizado: ");
                                nomeLider = scanner.nextLine();
                                System.out.print("Novo Pokémon Ace do líder: ");
                                pokemonAce = scanner.nextLine();
                                System.out.print("Nova idade do líder: ");
                                idadeLider = scanner.nextLine();
                                System.out.print("Novo nome da cidade do líder: ");
                                nomeCidade = scanner.nextLine();

                                Lider liderAtualizado = new Lider(nomeLider, pokemonAce, idadeLider, nomeCidade);
                                liderDAO.atualizarLider(liderAtualizado);
                                System.out.println("Líder atualizado com sucesso!");
                                break;

                            case 3:
                                System.out.println("Deletar um líder:");
                                System.out.print("Nome do líder a ser deletado: ");
                                nomeLider = scanner.nextLine();

                                liderDAO.deletarLider(nomeLider);
                                System.out.println("Líder deletado com sucesso!");
                                break;

                            case 4:
                                System.out.println("Listagem de todos os líderes:");
                                liderDAO.listarLideres();
                                break;

                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                        }

                        if (escolhaLider == 5) {
                            break;
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        System.out.println("Escolha uma operação para o treinador do ginásio:");
                        System.out.println("1. Adicionar treinador ao ginásio");
                        System.out.println("2. Remover treinador do ginásio");
                        System.out.println("3. Listar treinadores do ginásio");
                        System.out.println("4. Voltar ao menu principal");

                        int escolhaRelacao = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaRelacao) {
                            case 1:
                                System.out.println("Adicionar treinador ao ginásio:");
                                System.out.print("Nome do treinador: ");
                                String nomeTreinador = scanner.nextLine();
                                System.out.print("Insígnia do ginásio: ");
                                String insigniaGinasio = scanner.nextLine();

                                Ginasio_has_Treinador novaRelacao = new Ginasio_has_Treinador(nomeTreinador, insigniaGinasio);
                                ginasioHasTreinadorDAO.adicionarGinasioHasTreinador(novaRelacao);
                                System.out.println("Treinador adicionado ao ginásio com sucesso!");
                                break;

                            case 2:
                                System.out.println("Remover treinador do ginásio:");
                                System.out.print("Nome do treinador: ");
                                nomeTreinador = scanner.nextLine();
                                System.out.print("Insígnia do ginásio: ");
                                insigniaGinasio = scanner.nextLine();

                                ginasioHasTreinadorDAO.deletarGinasioHasTreinador(nomeTreinador, insigniaGinasio);
                                System.out.println("Treinador removido do ginásio com sucesso!");
                                break;

                            case 3:
                                System.out.println("Listar treinadores no ginasio:");
                                ginasioHasTreinadorDAO.listarGinasioHasTreinador();
                                break;

                            case 4:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                        }
                        if (escolhaRelacao == 4) break;
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}
