//package br.com.catalogo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.Optional;
//
//import br.com.catalogo.exception.EntidadeNaoEncontradaException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import java.math.BigDecimal;
//import br.com.catalogo.model.Produto;
//import br.com.catalogo.repository.ProdutoRepository;
//import br.com.catalogo.service.ProdutoService;
//import org.junit.Before;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class ProdutoControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    ProdutoRepository produtoRepository;
//
//    @Autowired
//    ProdutoService service;
//
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);}
//
//    @Test
//    public void deveraSalvarProdutoComSucesso() throws Exception {
//        Produto produto = Produto.builder()
//                .id(1L)
//                .name("Celular Sansung S20")
//                .description("Celular de última geração com 2 anos de garantia")
//                .price(BigDecimal.ZERO)
//                .build();
//
//        Produto newProduto = ProdutoRepository.save(produto);
//
//        assertThat(newProduto).isNotNull();
//    }
//
//    @Test
//    public void deveraAtualizarProdutoComSucesso() throws Exception {
//        Produto produto = ProdutoRepository.findById(10L)
//                .orElseThrow(() -> new EntidadeNaoEncontradaException("produto não encontrado") {
//                    private static final long serialVersionUID = 7154716946021059116L;
//        });
//        produto.setName("Celular Sansung");
//        ProdutoRepository.save(produto);
//        produto = ProdutoRepository.findById(10L).get();
//
//        assertThat(produto.getName()).isEqualTo("Celular Sansung S21");
//
//    }
//
//    @Test
//    public void deveraDeletarUmProdutoComSucesso() throws Exception {
//        Optional<Produto> newProduto= ProdutoRepository.findById(1L);
//        ProdutoRepository.delete(newProduto.get());
//        newProduto= ProdutoRepository.findById(1L);
//
//        assertThat(newProduto.isPresent()).isFalse();
//    }
//
//    @Test
//    public void deveraBuscarUmProdutoComSucesso() throws Exception {
//        Produto produto = Produto.builder()
//                .id(1L)
//                .name("Celular Sansung S20")
//                .description("Celular de última geração com 2 anos de garantia")
//                .price(BigDecimal.valueOf(3999))
//                .build();
//
//        Produto produtoDB = ProdutoRepository.findById(1L);
//
//        assertThat(produto).isEqualTo(produtoDB);
//
//    }
//
//}
//
